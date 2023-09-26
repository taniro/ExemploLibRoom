package ufrn.br.exemplolibroom.database

import androidx.room.Database
import androidx.room.RoomDatabase
import ufrn.br.exemplolibroom.model.Carro
import ufrn.br.exemplolibroom.repository.CarroDao

@Database(entities = [Carro::class], version = 2)
abstract class AppDatabase : RoomDatabase() {
    abstract fun carroDao(): CarroDao
}