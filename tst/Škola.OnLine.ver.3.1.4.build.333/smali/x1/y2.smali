.class public Lx1/y2;
.super Ljava/lang/Exception;
.source ""

# interfaces
.implements Lx1/h;


# static fields
.field private static final p:Ljava/lang/String;

.field private static final q:Ljava/lang/String;

.field private static final r:Ljava/lang/String;

.field private static final s:Ljava/lang/String;

.field private static final t:Ljava/lang/String;

.field public static final u:Lx1/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx1/h$a<",
            "Lx1/y2;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final n:I

.field public final o:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Lu3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lx1/y2;->p:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Lu3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lx1/y2;->q:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-static {v0}, Lu3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lx1/y2;->r:Ljava/lang/String;

    const/4 v0, 0x3

    invoke-static {v0}, Lu3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lx1/y2;->s:Ljava/lang/String;

    const/4 v0, 0x4

    invoke-static {v0}, Lu3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lx1/y2;->t:Ljava/lang/String;

    sget-object v0, Lx1/x2;->a:Lx1/x2;

    sput-object v0, Lx1/y2;->u:Lx1/h$a;

    return-void
.end method

.method protected constructor <init>(Landroid/os/Bundle;)V
    .locals 7

    sget-object v0, Lx1/y2;->r:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1}, Lx1/y2;->c(Landroid/os/Bundle;)Ljava/lang/Throwable;

    move-result-object v3

    sget-object v0, Lx1/y2;->p:Ljava/lang/String;

    const/16 v1, 0x3e8

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v4

    sget-object v0, Lx1/y2;->q:Ljava/lang/String;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v5

    invoke-virtual {p1, v0, v5, v6}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v5

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Lx1/y2;-><init>(Ljava/lang/String;Ljava/lang/Throwable;IJ)V

    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;IJ)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    iput p3, p0, Lx1/y2;->n:I

    iput-wide p4, p0, Lx1/y2;->o:J

    return-void
.end method

.method private static a(Ljava/lang/String;)Landroid/os/RemoteException;
    .locals 1

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0, p0}, Landroid/os/RemoteException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method private static b(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Throwable;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Throwable;"
        }
    .end annotation

    const/4 v0, 0x1

    new-array v1, v0, [Ljava/lang/Class;

    const-class v2, Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p0

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p1, v0, v3

    invoke-virtual {p0, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Throwable;

    return-object p0
.end method

.method private static c(Landroid/os/Bundle;)Ljava/lang/Throwable;
    .locals 4

    sget-object v0, Lx1/y2;->s:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lx1/y2;->t:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    const/4 v1, 0x1

    :try_start_0
    const-class v3, Lx1/y2;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-static {v0, v1, v3}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ljava/lang/Throwable;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0, p0}, Lx1/y2;->b(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Throwable;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v2, v0

    :cond_0
    if-nez v2, :cond_1

    :catchall_0
    invoke-static {p0}, Lx1/y2;->a(Ljava/lang/String;)Landroid/os/RemoteException;

    move-result-object v2

    :cond_1
    return-object v2
.end method
