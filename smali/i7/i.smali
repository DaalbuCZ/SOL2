.class public final Li7/i;
.super Lf7/w;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lf7/w<",
        "Ljava/lang/Number;",
        ">;"
    }
.end annotation


# static fields
.field private static final b:Lf7/x;


# instance fields
.field private final a:Lf7/v;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lf7/u;->o:Lf7/u;

    invoke-static {v0}, Li7/i;->g(Lf7/v;)Lf7/x;

    move-result-object v0

    sput-object v0, Li7/i;->b:Lf7/x;

    return-void
.end method

.method private constructor <init>(Lf7/v;)V
    .locals 0

    invoke-direct {p0}, Lf7/w;-><init>()V

    iput-object p1, p0, Li7/i;->a:Lf7/v;

    return-void
.end method

.method public static f(Lf7/v;)Lf7/x;
    .locals 1

    sget-object v0, Lf7/u;->o:Lf7/u;

    if-ne p0, v0, :cond_0

    sget-object p0, Li7/i;->b:Lf7/x;

    return-object p0

    :cond_0
    invoke-static {p0}, Li7/i;->g(Lf7/v;)Lf7/x;

    move-result-object p0

    return-object p0
.end method

.method private static g(Lf7/v;)Lf7/x;
    .locals 1

    new-instance v0, Li7/i;

    invoke-direct {v0, p0}, Li7/i;-><init>(Lf7/v;)V

    new-instance p0, Li7/i$a;

    invoke-direct {p0, v0}, Li7/i$a;-><init>(Li7/i;)V

    return-object p0
.end method


# virtual methods
.method public bridge synthetic c(Ln7/a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Li7/i;->h(Ln7/a;)Ljava/lang/Number;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Ln7/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p0, p1, p2}, Li7/i;->i(Ln7/c;Ljava/lang/Number;)V

    return-void
.end method

.method public h(Ln7/a;)Ljava/lang/Number;
    .locals 3

    invoke-virtual {p1}, Ln7/a;->Z()Ln7/b;

    move-result-object v0

    sget-object v1, Li7/i$b;->a:[I

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
    new-instance p1, Lf7/s;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expecting number, got: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lf7/s;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, Li7/i;->a:Lf7/v;

    invoke-interface {v0, p1}, Lf7/v;->e(Ln7/a;)Ljava/lang/Number;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-virtual {p1}, Ln7/a;->S()V

    const/4 p1, 0x0

    return-object p1
.end method

.method public i(Ln7/c;Ljava/lang/Number;)V
    .locals 0

    invoke-virtual {p1, p2}, Ln7/c;->b0(Ljava/lang/Number;)Ln7/c;

    return-void
.end method
