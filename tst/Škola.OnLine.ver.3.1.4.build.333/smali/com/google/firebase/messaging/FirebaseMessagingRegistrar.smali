.class public Lcom/google/firebase/messaging/FirebaseMessagingRegistrar;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-fcm"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lp5/e;)Lcom/google/firebase/messaging/FirebaseMessaging;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/messaging/FirebaseMessagingRegistrar;->lambda$getComponents$0(Lp5/e;)Lcom/google/firebase/messaging/FirebaseMessaging;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$0(Lp5/e;)Lcom/google/firebase/messaging/FirebaseMessaging;
    .locals 9

    new-instance v8, Lcom/google/firebase/messaging/FirebaseMessaging;

    const-class v0, Lk5/e;

    invoke-interface {p0, v0}, Lp5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lk5/e;

    const-class v0, Lm6/a;

    invoke-interface {p0, v0}, Lp5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lm6/a;

    const-class v0, Lh7/i;

    invoke-interface {p0, v0}, Lp5/e;->g(Ljava/lang/Class;)Ln6/b;

    move-result-object v3

    const-class v0, Ll6/j;

    invoke-interface {p0, v0}, Lp5/e;->g(Ljava/lang/Class;)Ln6/b;

    move-result-object v4

    const-class v0, Lo6/e;

    invoke-interface {p0, v0}, Lp5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo6/e;

    const-class v0, Lj1/g;

    invoke-interface {p0, v0}, Lp5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lj1/g;

    const-class v0, Lk6/d;

    invoke-interface {p0, v0}, Lp5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    move-object v7, p0

    check-cast v7, Lk6/d;

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lcom/google/firebase/messaging/FirebaseMessaging;-><init>(Lk5/e;Lm6/a;Ln6/b;Ln6/b;Lo6/e;Lj1/g;Lk6/d;)V

    return-object v8
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 4
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lp5/c<",
            "*>;>;"
        }
    .end annotation

    const/4 v0, 0x2

    new-array v0, v0, [Lp5/c;

    const-class v1, Lcom/google/firebase/messaging/FirebaseMessaging;

    invoke-static {v1}, Lp5/c;->c(Ljava/lang/Class;)Lp5/c$b;

    move-result-object v1

    const-string v2, "fire-fcm"

    invoke-virtual {v1, v2}, Lp5/c$b;->h(Ljava/lang/String;)Lp5/c$b;

    move-result-object v1

    const-class v3, Lk5/e;

    invoke-static {v3}, Lp5/r;->j(Ljava/lang/Class;)Lp5/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lp5/c$b;->b(Lp5/r;)Lp5/c$b;

    move-result-object v1

    const-class v3, Lm6/a;

    invoke-static {v3}, Lp5/r;->h(Ljava/lang/Class;)Lp5/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lp5/c$b;->b(Lp5/r;)Lp5/c$b;

    move-result-object v1

    const-class v3, Lh7/i;

    invoke-static {v3}, Lp5/r;->i(Ljava/lang/Class;)Lp5/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lp5/c$b;->b(Lp5/r;)Lp5/c$b;

    move-result-object v1

    const-class v3, Ll6/j;

    invoke-static {v3}, Lp5/r;->i(Ljava/lang/Class;)Lp5/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lp5/c$b;->b(Lp5/r;)Lp5/c$b;

    move-result-object v1

    const-class v3, Lj1/g;

    invoke-static {v3}, Lp5/r;->h(Ljava/lang/Class;)Lp5/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lp5/c$b;->b(Lp5/r;)Lp5/c$b;

    move-result-object v1

    const-class v3, Lo6/e;

    invoke-static {v3}, Lp5/r;->j(Ljava/lang/Class;)Lp5/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lp5/c$b;->b(Lp5/r;)Lp5/c$b;

    move-result-object v1

    const-class v3, Lk6/d;

    invoke-static {v3}, Lp5/r;->j(Ljava/lang/Class;)Lp5/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lp5/c$b;->b(Lp5/r;)Lp5/c$b;

    move-result-object v1

    sget-object v3, Lcom/google/firebase/messaging/b0;->a:Lcom/google/firebase/messaging/b0;

    invoke-virtual {v1, v3}, Lp5/c$b;->f(Lp5/h;)Lp5/c$b;

    move-result-object v1

    invoke-virtual {v1}, Lp5/c$b;->c()Lp5/c$b;

    move-result-object v1

    invoke-virtual {v1}, Lp5/c$b;->d()Lp5/c;

    move-result-object v1

    const/4 v3, 0x0

    aput-object v1, v0, v3

    const-string v1, "23.1.1"

    invoke-static {v2, v1}, Lh7/h;->b(Ljava/lang/String;Ljava/lang/String;)Lp5/c;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
