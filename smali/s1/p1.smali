.class public final Ls1/p1;
.super Ls1/w2;
.source ""


# static fields
.field public static final q:Ls1/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls1/h$a<",
            "Ls1/p1;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final o:Z

.field private final p:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Ls1/o1;->a:Ls1/o1;

    sput-object v0, Ls1/p1;->q:Ls1/h$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ls1/w2;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ls1/p1;->o:Z

    iput-boolean v0, p0, Ls1/p1;->p:Z

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1

    invoke-direct {p0}, Ls1/w2;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Ls1/p1;->o:Z

    iput-boolean p1, p0, Ls1/p1;->p:Z

    return-void
.end method

.method private static c(I)Ljava/lang/String;
    .locals 1

    const/16 v0, 0x24

    invoke-static {p0, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroid/os/Bundle;)Ls1/p1;
    .locals 0

    invoke-static {p0}, Ls1/p1;->e(Landroid/os/Bundle;)Ls1/p1;

    move-result-object p0

    return-object p0
.end method

.method private static e(Landroid/os/Bundle;)Ls1/p1;
    .locals 3

    const/4 v0, 0x0

    invoke-static {v0}, Ls1/p1;->c(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, -0x1

    invoke-virtual {p0, v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    invoke-static {v1}, Lp3/a;->a(Z)V

    invoke-static {v2}, Ls1/p1;->c(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Ls1/p1;

    const/4 v2, 0x2

    invoke-static {v2}, Ls1/p1;->c(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p0

    invoke-direct {v1, p0}, Ls1/p1;-><init>(Z)V

    goto :goto_1

    :cond_1
    new-instance v1, Ls1/p1;

    invoke-direct {v1}, Ls1/p1;-><init>()V

    :goto_1
    return-object v1
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Ls1/p1;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Ls1/p1;

    iget-boolean v0, p0, Ls1/p1;->p:Z

    iget-boolean v2, p1, Ls1/p1;->p:Z

    if-ne v0, v2, :cond_1

    iget-boolean v0, p0, Ls1/p1;->o:Z

    iget-boolean p1, p1, Ls1/p1;->o:Z

    if-ne v0, p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    iget-boolean v1, p0, Ls1/p1;->o:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-boolean v1, p0, Ls1/p1;->p:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, La5/i;->b([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
