package br.com.udemy.api.resources;

import br.com.udemy.api.domain.User;
import br.com.udemy.api.domain.dto.UserDto;
import br.com.udemy.api.services.UserServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserResourceTest {

    private static final String E_MAIL_JA_CADASTRADO_NO_SISTEMA = "E-mail já cadastrado no sistema.";
    private static final String USER_NOT_FOUND = "User not found";
    private static final Integer ID = 1;
    private static final String NAME = "Jhony";
    private static final String EMAIL = "jhony.o_rodrigues@hotmail.com";
    private static final String PASSWORD = "123";
    private static final Integer INDEX = 0;
    public static final String NOT_FOUND = "User not found";

    private User user;
    private UserDto userDto;

    @InjectMocks
    private UserResource resource;

    @Mock
    private UserServiceImpl service;

    @Mock
    private ModelMapper mapper;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        startUser();
    }

    @Test
    void findById() {
    }

    @Test
    void findAll() {
    }

    @Test
    void create() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    private void startUser() {
        user = new User(ID, NAME, EMAIL, PASSWORD);
        userDto = new UserDto(ID, NAME, EMAIL, PASSWORD);
    }
}