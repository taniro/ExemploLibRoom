package ufrn.br.exemplolibroom.repository

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update
import ufrn.br.exemplolibroom.model.Carro


@Dao
interface CarroDao {

    @Insert
    fun inserirUnicoCarro(carro1: Carro): Long
    @Insert
    fun inserir(carro1:Carro)

    @Update
    fun atualiza(carro1: Carro)

    @Delete
    fun removerCarro(carro: Carro)

}