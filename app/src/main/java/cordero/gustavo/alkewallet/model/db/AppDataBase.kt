package cordero.gustavo.alkewallet.model.db

import androidx.room.Database
import androidx.room.RoomDatabase

/**
 * Aca se configura la Base de datos
 */
@Database(entities = [AlkeWalletEntidad::class], version = 1)
abstract class AppDataBase : RoomDatabase() {
    //Aca le digo que Dao vamos a usar
    abstract fun alkeDao(): AlkeWalletDao
}