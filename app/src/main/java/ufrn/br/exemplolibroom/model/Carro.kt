package ufrn.br.exemplolibroom.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Carro(
    val ano:Int,
    val modelo:String,
    var cor:String
){
    @PrimaryKey(autoGenerate = true)
    var id:Long = 0
}