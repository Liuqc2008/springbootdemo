package springboot.web.model.enums.handlers;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import springboot.web.model.enums.State;

@MappedTypes({ State.class })
public class StateTypeHandler implements TypeHandler<State> {

	@Override
	public void setParameter(PreparedStatement preparedStatement, int i, State state, JdbcType jdbcType)
			throws SQLException {
		preparedStatement.setInt(i, state.getCode());
	}

	@Override
	public State getResult(ResultSet resultSet, String s) throws SQLException {
		Integer code = resultSet.getInt(s);
		return State.getStateByCode(code);
	}

	@Override
	public State getResult(ResultSet resultSet, int i) throws SQLException {
		Integer code = resultSet.getInt(i);
		return State.getStateByCode(code);
	}

	@Override
	public State getResult(CallableStatement callableStatement, int i) throws SQLException {
		Integer code = callableStatement.getInt(i);
		return State.getStateByCode(code);
	}
}
