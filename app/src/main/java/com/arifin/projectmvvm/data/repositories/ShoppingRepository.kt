package com.arifin.projectmvvm.data.repositories

import com.arifin.projectmvvm.data.db.ShoppingDao
import com.arifin.projectmvvm.data.db.ShoppingDatabase
import com.arifin.projectmvvm.data.db.entities.ShoppingItem

class ShoppingRepository (
    private val db: ShoppingDatabase
){
    suspend fun upsert(item: ShoppingItem) = db.getSupportDao().upsert(item)

    suspend fun delete(item: ShoppingItem) = db.getSupportDao().delete(item)

    fun getAllShoppingItems() = db.getSupportDao().getAllShoppingItems()
}