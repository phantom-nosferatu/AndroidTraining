package android.training.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface NoteDAO {

    @Query("SELECT * FROM note")
    fun getAllNotes(): List<Note>

    @Insert
    fun addNote(note: Note)
}