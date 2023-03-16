package com.google.protobuf;

import com.google.protobuf.s0;
/* loaded from: classes.dex */
public abstract class b<MessageType extends s0> implements a1<MessageType> {

    /* renamed from: a  reason: collision with root package name */
    private static final p f5911a = p.b();

    private MessageType c(MessageType messagetype) {
        if (messagetype == null || messagetype.u()) {
            return messagetype;
        }
        throw d(messagetype).a().j(messagetype);
    }

    private n1 d(MessageType messagetype) {
        return messagetype instanceof a ? ((a) messagetype).v() : new n1(messagetype);
    }

    @Override // com.google.protobuf.a1
    /* renamed from: e */
    public MessageType a(h hVar, p pVar) {
        return c(f(hVar, pVar));
    }

    public MessageType f(h hVar, p pVar) {
        try {
            i F = hVar.F();
            MessageType messagetype = (MessageType) b(F, pVar);
            try {
                F.a(0);
                return messagetype;
            } catch (c0 e10) {
                throw e10.j(messagetype);
            }
        } catch (c0 e11) {
            throw e11;
        }
    }
}
