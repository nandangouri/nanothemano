
export default function GetAllSongs() { 

    const apiurl = `https://www.googleapis.com/youtube/v3/playlistItems?part=snippet&key=${process.env.REACT_APP_API_KEY}&playlistId=UULF9ecwl3FTG66jIKA9JRDtmg&maxResults=50`
    const url = "http://localhost:8080";

    
    const addSongs = (data) => { 
        let songs = data.items;
        console.log(data.nextPageToken);
            if(Array.isArray(songs)) {
                songs.forEach(a => {
                   let siivag = {
                        title: a.snippet.title,
                        youtube_link: a.snippet.resourceId.videoId
                   }
                   addSongtoDatabase(siivag);
                })
                }

    };

    const addSongtoDatabase = (siivag) => {
        const init = {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'

            },
            body: JSON.stringify(siivag)
        };

    fetch(`${url}/api/siivagunner`, init).then(
        response => {
            if (response.status === 201 || response.status === 400) {
                return response.json();
            } else {
                return Promise.reject(`Unexpected status code: ${response.status}`);
            }
        }
    )

        

    }

    const getSongs = (nextpagecall) => {
        if (nextpagecall !== null && nextpagecall !== '')
        fetch(nextpagecall)
            .then(response => {
                if (response.status === 200) {
                    return response.json();
                } else {
                    return console.log(response);
                }
        }).then(data => {
            addSongs(data);
            if (data.nextPageToken !== null && data.nextPageToken !== '') {
                nextpagecall = `${apiurl}&pageToken=${data.nextPageToken}`;
                getSongs(nextpagecall);
            }
        }
    ).catch(console.log);
    }

    const  getallFUCKINGSONGS = ()  => {
        getSongs(apiurl);
        }
    

    return(<>
    <button onClick={() => getallFUCKINGSONGS()}> Test Data format </button>
        
    </>)
}