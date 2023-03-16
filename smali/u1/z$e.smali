.class public final Lu1/z$e;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu1/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# instance fields
.field private a:Lu1/f;

.field private b:Lu1/z$c;

.field private c:Z

.field private d:Z

.field private e:I

.field f:Lu1/z$d;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lu1/f;->c:Lu1/f;

    iput-object v0, p0, Lu1/z$e;->a:Lu1/f;

    const/4 v0, 0x0

    iput v0, p0, Lu1/z$e;->e:I

    sget-object v0, Lu1/z$d;->a:Lu1/z$d;

    iput-object v0, p0, Lu1/z$e;->f:Lu1/z$d;

    return-void
.end method

.method static synthetic a(Lu1/z$e;)Lu1/f;
    .locals 0

    iget-object p0, p0, Lu1/z$e;->a:Lu1/f;

    return-object p0
.end method

.method static synthetic b(Lu1/z$e;)Lu1/z$c;
    .locals 0

    iget-object p0, p0, Lu1/z$e;->b:Lu1/z$c;

    return-object p0
.end method

.method static synthetic c(Lu1/z$e;)Z
    .locals 0

    iget-boolean p0, p0, Lu1/z$e;->c:Z

    return p0
.end method

.method static synthetic d(Lu1/z$e;)Z
    .locals 0

    iget-boolean p0, p0, Lu1/z$e;->d:Z

    return p0
.end method

.method static synthetic e(Lu1/z$e;)I
    .locals 0

    iget p0, p0, Lu1/z$e;->e:I

    return p0
.end method


# virtual methods
.method public f()Lu1/z;
    .locals 2

    iget-object v0, p0, Lu1/z$e;->b:Lu1/z$c;

    if-nez v0, :cond_0

    new-instance v0, Lu1/z$g;

    const/4 v1, 0x0

    new-array v1, v1, [Lu1/g;

    invoke-direct {v0, v1}, Lu1/z$g;-><init>([Lu1/g;)V

    iput-object v0, p0, Lu1/z$e;->b:Lu1/z$c;

    :cond_0
    new-instance v0, Lu1/z;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lu1/z;-><init>(Lu1/z$e;Lu1/z$a;)V

    return-object v0
.end method

.method public g(Lu1/f;)Lu1/z$e;
    .locals 0

    invoke-static {p1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lu1/z$e;->a:Lu1/f;

    return-object p0
.end method

.method public h(Z)Lu1/z$e;
    .locals 0

    iput-boolean p1, p0, Lu1/z$e;->d:Z

    return-object p0
.end method

.method public i(Z)Lu1/z$e;
    .locals 0

    iput-boolean p1, p0, Lu1/z$e;->c:Z

    return-object p0
.end method

.method public j(I)Lu1/z$e;
    .locals 0

    iput p1, p0, Lu1/z$e;->e:I

    return-object p0
.end method
