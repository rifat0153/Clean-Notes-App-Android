package com.example.notesapp.feature_note.domain.usecase

import com.example.notesapp.feature_note.domain.model.Note
import com.example.notesapp.feature_note.domain.repository.NoteRepository

class DeleteNoteUseCase(
    private  val noteRepository: NoteRepository
) {

    suspend  operator  fun invoke(note: Note) {
        noteRepository.deleteNote(note = note)
    }

}