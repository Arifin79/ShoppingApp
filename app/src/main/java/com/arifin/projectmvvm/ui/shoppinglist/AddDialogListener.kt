package com.arifin.projectmvvm.ui.shoppinglist

import com.arifin.projectmvvm.data.db.entities.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}