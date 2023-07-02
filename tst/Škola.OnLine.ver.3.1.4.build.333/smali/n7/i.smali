.class public final Ln7/i;
.super Lk7/w;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lk7/w<",
        "Ljava/lang/Number;",
        ">;"
    }
.end annotation


# static fields
.field private static final b:Lk7/x;


# instance fields
.field private final a:Lk7/v;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lk7/u;->o:Lk7/u;

    invoke-static {v0}, Ln7/i;->g(Lk7/v;)Lk7/x;

    move-result-object v0

    sput-object v0, Ln7/i;->b:Lk7/x;

    return-void
.end method

.method private constructor <init>(Lk7/v;)V
    .locals 0

    invoke-direct {p0}, Lk7/w;-><init>()V

    iput-object p1, p0, Ln7/i;->a:Lk7/v;

    return-void
.end method

.method public static f(Lk7/v;)Lk7/x;
    .locals 1

    sget-object v0, Lk7/u;->o:Lk7/u;

    if-ne p0, v0, :cond_0

    sget-object p0, Ln7/i;->b:Lk7/x;

    return-object p0

    :cond_0
    invoke-static {p0}, Ln7/i;->g(Lk7/v;)Lk7/x;

    move-result-object p0

    return-object p0
.end method

.method private static g(Lk7/v;)Lk7/x;
    .locals 1

    new-instance v0, Ln7/i;

    invoke-direct {v0, p0}, Ln7/i;-><init>(Lk7/v;)V

    new-instance p0, Ln7/i$a;

    invoke-direct {p0, v0}, Ln7/i$a;-><init>(Ln7/i;)V

    return-object p0
.end method


# virtual methods
.method public bridge synthetic c(Ls7/a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Ln7/i;->h(Ls7/a;)Ljava/lang/Number;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Ls7/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p0, p1, p2}, Ln7/i;->i(Ls7/c;Ljava/lang/Number;)V

    return-void
.end method

.method public h(Ls7/a;)Ljava/lang/Number;
    .locals 3

    invoke-virtual {p1}, Ls7/a;->Z()Ls7/b;

    move-result-object v0

    sget-object v1, Ln7/i$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lk7/s;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expecting number, got: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lk7/s;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, Ln7/i;->a:Lk7/v;

    invoke-interface {v0, p1}, Lk7/v;->e(Ls7/a;)Ljava/lang/Number;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-virtual {p1}, Ls7/a;->V()V

    const/4 p1, 0x0

    return-object p1
.end method

.method public i(Ls7/c;Ljava/lang/Number;)V
    .locals 0

    invoke-virtual {p1, p2}, Ls7/c;->b0(Ljava/lang/Number;)Ls7/c;

    return-void
.end method
