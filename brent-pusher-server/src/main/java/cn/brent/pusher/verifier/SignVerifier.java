package cn.brent.pusher.verifier;

import cn.brent.pusher.IVerifier;
import cn.brent.pusher.server.PathDesc;

public abstract class SignVerifier implements IVerifier {

	@Override
	public String failMsg(PathDesc path) {
		return "sign authentication failed";
	}

}
