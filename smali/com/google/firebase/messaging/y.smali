.class public final synthetic Lcom/google/firebase/messaging/y;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt4/h;


# instance fields
.field public final synthetic a:Lcom/google/firebase/messaging/FirebaseMessaging;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lcom/google/firebase/messaging/w0$a;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/messaging/FirebaseMessaging;Ljava/lang/String;Lcom/google/firebase/messaging/w0$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/messaging/y;->a:Lcom/google/firebase/messaging/FirebaseMessaging;

    iput-object p2, p0, Lcom/google/firebase/messaging/y;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/firebase/messaging/y;->c:Lcom/google/firebase/messaging/w0$a;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Lt4/i;
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/messaging/y;->a:Lcom/google/firebase/messaging/FirebaseMessaging;

    iget-object v1, p0, Lcom/google/firebase/messaging/y;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/firebase/messaging/y;->c:Lcom/google/firebase/messaging/w0$a;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, v2, p1}, Lcom/google/firebase/messaging/FirebaseMessaging;->b(Lcom/google/firebase/messaging/FirebaseMessaging;Ljava/lang/String;Lcom/google/firebase/messaging/w0$a;Ljava/lang/String;)Lt4/i;

    move-result-object p1

    return-object p1
.end method