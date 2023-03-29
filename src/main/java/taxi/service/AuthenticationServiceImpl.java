package taxi.service;

import java.util.Optional;
import javax.naming.AuthenticationException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import taxi.lib.Inject;
import taxi.lib.Service;
import taxi.model.Driver;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private final Logger logger = LogManager.getLogger(AuthenticationServiceImpl.class);
    @Inject
    private DriverService driverService;

    @Override
    public Driver login(String login, String password) throws AuthenticationException {
        Optional<Driver> foundDriver = driverService.findByLogin(login);
        if (!foundDriver.isEmpty() && foundDriver.get().getPassword().equals(password)) {
            logger.info("User with id = {} was logged seccessfully", login);
            return foundDriver.get();
        }
        logger.error("Login or password was incorrect");
        throw new AuthenticationException("Login or password was incorrect");
    }
}
