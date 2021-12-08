package com.example.shopinglist.domain

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun getShopItem(shopItemId: Int) {
        return shopListRepository.getShopItem(shopItemId)
    }
}