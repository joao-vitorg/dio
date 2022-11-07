const pokemonList = document.getElementById("pokemonList")
const loadMoreButton = document.getElementById("loadMoreButton")

let page = 1

function convertPokemonToLi(pokemon) {
    return `
        <li class="pokemon ${pokemon.type}">
            <span class="number">#${pokemon.number}</span>
            <span class="name">${pokemon.name}</span>
            <div class="detail">
                <ol class="types">
                    ${pokemon.types.map((type) => `<li class="type ${type}">${type}</li>`).join("")}
                </ol>
                <img src="${pokemon.photo}"
                     alt="${pokemon.name}">
            </div>
        </li>
    `
}

function loadPokemonItens(page = 1) {
    getPokemons(page).then((pokemons = []) => {
        const newHtml = pokemons.map(convertPokemonToLi).join("")
        pokemonList.innerHTML += newHtml
    })
}

loadPokemonItens(page)

loadMoreButton.addEventListener("click", () => {
    page++

    // if (qtdRecordsWithNexPage >= maxRecords) {
    //     const newLimit = maxRecords - offset
    //     loadPokemonItens(offset, newLimit)

    // loadMoreButton.parentElement.removeChild(loadMoreButton)
    // } else {
    loadPokemonItens(page)
    // }
})
