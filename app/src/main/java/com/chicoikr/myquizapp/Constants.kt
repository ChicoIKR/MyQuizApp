package com.chicoikr.myquizapp

object Constants {

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "What country does this flag belong to?", R.drawable.ic_flag_of_argentina,
            "Argentina",
            "Australia",
            "Yo Momma",
            "Narnia",
            1

        )
        questionsList.add(que1)

        val que2 = Question(
            2, "What country does this flag belong to?", R.drawable.ic_flag_of_australia,
            "Argentina",
            "Australia",
            "New Zealand",
            "Zealandia",
            2

        )
        questionsList.add(que2)

        val que3 = Question(
            1, "What country does this flag belong to?", R.drawable.ic_flag_of_belgium,
            "Horwards",
            "Botswana",
            "Belgium",
            "Teta",
            3

        )
        questionsList.add(que3)

        val que4 = Question(
            1, "What country does this flag belong to?", R.drawable.ic_flag_of_brazil,
            "Futbol",
            "Ronaldinho",
            "Brazil",
            "Maracana",
            3

        )
        questionsList.add(que4)

        val que5 = Question(
            1, "What country does this flag belong to?", R.drawable.ic_flag_of_denmark,
            "Sweden",
            "Norway",
            "Switzerland",
            "Denmark",
            4

        )
        questionsList.add(que5)

        val que6 = Question(
            1, "What country does this flag belong to?", R.drawable.ic_flag_of_fiji,
            "Bottled Water",
            "Hawaii",
            "Fiji",
            "Vesubio",
            3

        )
        questionsList.add(que6)

        val que7 = Question(
            1, "What country does this flag belong to?", R.drawable.ic_flag_of_germany,
            "Italy",
            "Spain",
            "Mississipi",
            "Germany",
            4

        )
        questionsList.add(que7)

        val que8 = Question(
            1, "What country does this flag belong to?", R.drawable.ic_flag_of_india,
            "India",
            "Paquistan",
            "Paquita Salas",
            "Westeros",
            1

        )
        questionsList.add(que8)

        val que9 = Question(
            1, "What country does this flag belong to?", R.drawable.ic_flag_of_kuwait,
            "Kuwait",
            "Bangalore",
            "Tracer",
            "Mussol",
            1

        )
        questionsList.add(que9)

        val que10 = Question(
            1, "What country does this flag belong to?", R.drawable.ic_flag_of_new_zealand,
            "Kiwi",
            "Hobbiton",
            "Mordor",
            "New Zealand",
            4

        )
        questionsList.add(que10)

        return questionsList


    }

}