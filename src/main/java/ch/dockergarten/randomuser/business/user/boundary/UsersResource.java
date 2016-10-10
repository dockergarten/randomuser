/*
 * RandomUser – Provide random user data as a demo service for RESTful clients
 * Copyright (C) 2016 Marcus Fihlon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package ch.dockergarten.randomuser.business.user.boundary;

import ch.dockergarten.randomuser.business.user.control.UserService;
import ch.dockergarten.randomuser.business.user.entity.User;

import javax.inject.Inject;
import javax.validation.constraints.NotNull;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.Collection;

@Path("users")
public class UsersResource {

    private UserService userService;

    @Inject
    public UsersResource(@NotNull final UserService userService) {
        this.userService = userService;
    }

    @GET
    public Collection<User> read() {
        return userService.getAllUsers();
    }

}
