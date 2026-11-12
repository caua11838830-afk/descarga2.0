

      <!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <title>Descarga Simulator</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>

<h1>🚽 Descarga Simulator</h1>

<div id="game">

    <div id="vaso">
        🚽
    </div>

    <button id="cordinha">
        Puxar a Cordinha
    </button>

    <h2>Monte a palavra!</h2>

    <div id="letras"></div>

    <h3 id="resultado"></h3>

</div>

<script src="script.js"></script>

</body>
</html>
body{
    font-family:Arial;
    background:#87CEEB;
    text-align:center;
}

#game{
    margin-top:40px;
}

#vaso{
    font-size:150px;
}

#cordinha{
    padding:15px 30px;
    font-size:20px;
    cursor:pointer;
    margin-bottom:30px;
}

#letras{
    display:flex;
    justify-content:center;
    gap:15px;
    margin-top:20px;
    flex-wrap:wrap;
}

.letra{

    width:60px;
    height:60px;

    background:white;

    border-radius:10px;

    display:flex;

    justify-content:center;

    align-items:center;

    font-size:35px;

    font-weight:bold;

    animation:cair 1s;
}

@keyframes cair{

0%{
transform:translateY(-300px);
opacity:0;
}

100%{
transform:translateY(0);
opacity:1;
}

}

#resultado{
margin-top:30px;
color:green;
}
const palavras = [

"ESCOLA",
"LIVRO",
"CIENCIA",
"PLANETA",
"MATEMATICA",
"LEITURA",
"HISTORIA",
"GEOGRAFIA",
"BIOLOGIA",
"PORTUGUES"

];

let indice = 0;

    const letras = document.getElementById("letras");
const resultado = document.getElementById("resultado");

document.getElementById("cordinha").addEventListener("click",descarga);

    function descarga() {

        letras.innerHTML = "";
        resultado.innerHTML = "";

        if (indice >= palavras.length) {
            indice = 0;
        }

        let palavra = palavras[indice];

        indice++;
        [...palavra
        ].forEach((letra, i) =  >
        {

            setTimeout(() =  >
            {

                let div = document.createElement("div");

                div.className = "letra";

                div.innerHTML = letra;

                letras.appendChild(div);

                if (i == palavra.length - 1) {

                    resultado.innerHTML = "Palavra formada: " + palavra;

                }

            },i * 500
        


        


        


    );}
