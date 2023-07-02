.class Lio/flutter/plugins/firebase/messaging/e$b;
.super Ljava/util/HashMap;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/flutter/plugins/firebase/messaging/e;->H(Ljava/util/Map;Ly4/j;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/HashMap<",
        "Ljava/lang/String;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic n:Lcom/google/firebase/messaging/FirebaseMessaging;

.field final synthetic o:Lio/flutter/plugins/firebase/messaging/e;


# direct methods
.method constructor <init>(Lio/flutter/plugins/firebase/messaging/e;Lcom/google/firebase/messaging/FirebaseMessaging;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/firebase/messaging/e$b;->o:Lio/flutter/plugins/firebase/messaging/e;

    iput-object p2, p0, Lio/flutter/plugins/firebase/messaging/e$b;->n:Lcom/google/firebase/messaging/FirebaseMessaging;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p2}, Lcom/google/firebase/messaging/FirebaseMessaging;->y()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const-string p2, "isAutoInitEnabled"

    invoke-virtual {p0, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
