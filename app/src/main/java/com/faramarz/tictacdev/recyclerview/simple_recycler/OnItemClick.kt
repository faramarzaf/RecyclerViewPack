package com.faramarz.tictacdev.recyclerview.simple_recycler

import android.view.View

interface OnItemClick {
    fun onClick(view: View?, position: Int, title: String)
}