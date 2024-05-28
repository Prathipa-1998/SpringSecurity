package in.co.security.SpringSecurity.entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
	@Table(name = "roles")
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public class Role {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;

	    @Enumerated(EnumType.STRING)
	    @Column(length = 20)
	    private ERole name;
	}

