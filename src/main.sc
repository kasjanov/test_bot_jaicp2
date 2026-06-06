require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Начнём.

    state: Hello
        q!: *(~hello*/~привет*)*
        random:
            a: Привет привет
            a: И вам не хворать)
            a: Здравствуйте!
    
    state: Weather
        q!: *(~weather*/~погода*)*
        a: погода сегодня топчик!

    state: Bye
        intent!: /пока
        a: Пока пока

    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

    state: Match
        event!: match
        a: {{$context.intent.answer}}