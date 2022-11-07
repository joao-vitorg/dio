function PokemonMap(pokeDetail) {
    const pokemon = new Pokemon()
    pokemon.number = pokeDetail.id
    pokemon.name = pokeDetail.name
    pokemon.types = pokeDetail.types.map((typeSlot) => typeSlot.type.name)
    pokemon.type = pokemon.types[0]
    pokemon.photo = pokeDetail.sprites.other.dream_world.front_default

    return pokemon
}

getPokemons = (page = 1) => {
    const offset = (page - 1) * 9
    const limit = offset + 9
    let pokemons = []

    for (let i = offset + 1; i <= limit; i++) {
        pokemons.push(
            fetch(`https://pokeapi.co/api/v2/pokemon/${i}`)
                .then((response) => response.json())
                .then(PokemonMap)
        )
    }

    return Promise.all(pokemons)
}
