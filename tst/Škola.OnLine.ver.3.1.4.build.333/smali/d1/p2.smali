.class public Ld1/p2;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Ld1/z2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld1/z2<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ld1/z2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld1/z2<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v0

    invoke-static {p0, v0}, Ld1/p2;->a(Ld1/p2;Ljava/lang/Thread$UncaughtExceptionHandler;)Ld1/w1;

    move-result-object v0

    iput-object p1, p0, Ld1/p2;->a:Ld1/z2;

    invoke-static {v0}, Ld1/p2;->c(Ld1/w1;)V

    return-void
.end method

.method private static a(Ld1/p2;Ljava/lang/Thread$UncaughtExceptionHandler;)Ld1/w1;
    .locals 1

    new-instance v0, Ld1/w1;

    invoke-direct {v0, p0, p1}, Ld1/w1;-><init>(Ld1/p2;Ljava/lang/Thread$UncaughtExceptionHandler;)V

    return-object v0
.end method

.method public static b(Ld1/z2;)Ld1/p2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld1/z2<",
            "Ljava/lang/String;",
            ">;)",
            "Ld1/p2;"
        }
    .end annotation

    new-instance v0, Ld1/p2;

    invoke-direct {v0, p0}, Ld1/p2;-><init>(Ld1/z2;)V

    return-object v0
.end method

.method private static c(Ld1/w1;)V
    .locals 0

    invoke-static {p0}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    return-void
.end method


# virtual methods
.method public d(Ld1/q2;)V
    .locals 1

    iget-object v0, p0, Ld1/p2;->a:Ld1/z2;

    invoke-virtual {p1}, Ld1/q2;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ld1/z2;->e(Ljava/lang/Object;)Z

    iget-object p1, p0, Ld1/p2;->a:Ld1/z2;

    invoke-virtual {p1}, Ld1/z2;->l()Z

    return-void
.end method
