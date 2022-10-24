const cards = Array.from(document.querySelectorAll(".card"))
let cardForCheck
let boardLocked
let matchedCards

cards.forEach((c) => c.addEventListener("click", flipCard))

function startGame() {
    boardLocked = false
    matchedCards = 0

    shuffleCards()
    flipAllCards()
}

function flipCard() {
    if (this.classList.contains("flip") || boardLocked) return

    this.classList.add("flip")

    if (cardForCheck == null) cardForCheck = this
    else checkForMatch(this)
}

function checkForMatch(card) {
    if (cardForCheck.dataset.language !== card.dataset.language) {
        cardMismatch(card, cardForCheck)
    } else {
        cardMatch(card, cardForCheck)
    }

    cardForCheck = null
}

function cardMatch(card1, card2) {
    matchedCards++

    card1.classList.add("hide")
    card2.classList.add("hide")

    if (matchedCards === 9) {
        unFlipAllCards()

        setTimeout(() => {
            startGame()
        }, 2000)
    }
}

function cardMismatch(card1, card2) {
    boardLocked = true

    setTimeout(() => {
        card1.classList.remove("flip")
        card2.classList.remove("flip")

        boardLocked = false
    }, 1000)
}

function shuffleCards() {
    cards.forEach((c) => (c.style.order = String(Math.floor(Math.random() * 12))))
}

function flipAllCards() {
    boardLocked = true

    cards.forEach((c) => c.classList.add("flip"))

    setTimeout(() => {
        unFlipAllCards()
        boardLocked = false
    }, 5000)
}

function unFlipAllCards() {
    cards.forEach((c) => {
        c.classList.remove("flip")
        c.classList.remove("hide")
    })
}

startGame()
