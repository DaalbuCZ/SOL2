.class Lz1/b$c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz1/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:I


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lz1/b$a;)V
    .locals 0

    invoke-direct {p0}, Lz1/b$c;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lp3/a0;)V
    .locals 1

    invoke-virtual {p1}, Lp3/a0;->p()I

    move-result v0

    iput v0, p0, Lz1/b$c;->a:I

    invoke-virtual {p1}, Lp3/a0;->p()I

    move-result p1

    iput p1, p0, Lz1/b$c;->b:I

    const/4 p1, 0x0

    iput p1, p0, Lz1/b$c;->c:I

    return-void
.end method

.method public b(Lp3/a0;)V
    .locals 2

    invoke-virtual {p0, p1}, Lz1/b$c;->a(Lp3/a0;)V

    iget v0, p0, Lz1/b$c;->a:I

    const v1, 0x5453494c

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lp3/a0;->p()I

    move-result p1

    iput p1, p0, Lz1/b$c;->c:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "LIST expected, found: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lz1/b$c;->a:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ls1/h2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls1/h2;

    move-result-object p1

    throw p1
.end method
