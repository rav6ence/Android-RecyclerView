package com.serafine.recyclerview

class AgentsData {
    public val data = arrayOf(
        arrayOf(
            "Jett",
            "Duelist",
            R.drawable.jett
        ),
        arrayOf(
            "Reyna",
            "Duelist",
            R.drawable.jett
        ),
        arrayOf(
            "Sage",
            "Sentinel",
            R.drawable.jett
        ),
        arrayOf(
            "Phoenix",
            "Duelist",
            R.drawable.jett
        ),
        arrayOf(
            "Omen",
            "Controller",
            R.drawable.jett
        )
    )

    val listData: ArrayList<Agent>
        get() {
            val list = arrayListOf<Agent>()
            for (aData in data){
                val agent = Agent()
                agent.name = aData[0] as String
                agent.role = aData[1] as String
                agent.photo = aData[2] as Int

                list.add(agent)
            }
            return list
        }
}