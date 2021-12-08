package com.example.shopinglist.domain

class GetShopListUseCasse(private val shopListRepository: ShopListRepository) {
    fun getShopList(): List<ShopItem> {
        return shopListRepository.getShopList()
    }
}