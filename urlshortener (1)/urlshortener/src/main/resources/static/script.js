async function shortenURL() {

    let longURL = document.getElementById("longURL").value;

    let response = await fetch("http://localhost:8081/shorten",{
        method:"POST",
        headers:{
            "Content-Type":"text/plain"
        },
        body:longURL
    });

    let code = await response.text();

    document.getElementById("shortResult").innerHTML =
    "Short URL : http://localhost:8081/" + code;
}

async function resolveURL(){

    let code=document.getElementById("code").value;

    let response=await fetch("http://localhost:8081/resolve/"+code);

    let url=await response.text();

    document.getElementById("resolveResult").innerHTML =
    "Original URL : " + url;
}