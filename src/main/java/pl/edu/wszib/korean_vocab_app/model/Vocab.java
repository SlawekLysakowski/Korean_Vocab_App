package pl.edu.wszib.korean_vocab_app.model;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "vocabs")
public class Vocab {

        @Id
        @Column(name = "id", nullable = false)
        @GeneratedValue
        private Long id;
        @Valid
        @NotBlank(message = "Meaning in Japanese must be filled")
        @Column(name = "Japanese", nullable = false)
        private String japanese;

        @Valid
        @NotBlank(message = "Meaning in Korean must be filled")
        @Column(name = "Korean", nullable = false)
        private String korean;

        @Valid
        @NotBlank(message = "Meaning in English must be filled")
        @Column(name = "English", nullable = false)
        private String english;

        @Valid
        @NotBlank(message = "Meaning in Polish must be filled")
        @Column(name = "Polish", nullable = false)
        private String polish;

    public Vocab(String japanese, String korean, String english, String polish) {
        this.japanese = japanese;
        this.korean = korean;
        this.english = english;
        this.polish = polish;
    }
    public Vocab() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJapanese() {
        return japanese;
    }

    public void setJapanese(String japanese) {
        this.japanese = japanese;
    }

    public String getKorean() {
        return korean;
    }

    public void setKorean(String korean) {
        this.korean = korean;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getPolish() {
        return polish;
    }

    public void setPolish(String polish) {
        this.polish = polish;
    }
};
