.class Ll7/c;
.super Lf7/w;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lf7/w<",
        "Ljava/sql/Timestamp;",
        ">;"
    }
.end annotation


# static fields
.field static final b:Lf7/x;


# instance fields
.field private final a:Lf7/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf7/w<",
            "Ljava/util/Date;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ll7/c$a;

    invoke-direct {v0}, Ll7/c$a;-><init>()V

    sput-object v0, Ll7/c;->b:Lf7/x;

    return-void
.end method

.method private constructor <init>(Lf7/w;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf7/w<",
            "Ljava/util/Date;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lf7/w;-><init>()V

    iput-object p1, p0, Ll7/c;->a:Lf7/w;

    return-void
.end method

.method synthetic constructor <init>(Lf7/w;Ll7/c$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ll7/c;-><init>(Lf7/w;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic c(Ln7/a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Ll7/c;->f(Ln7/a;)Ljava/sql/Timestamp;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Ln7/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/sql/Timestamp;

    invoke-virtual {p0, p1, p2}, Ll7/c;->g(Ln7/c;Ljava/sql/Timestamp;)V

    return-void
.end method

.method public f(Ln7/a;)Ljava/sql/Timestamp;
    .locals 3

    iget-object v0, p0, Ll7/c;->a:Lf7/w;

    invoke-virtual {v0, p1}, Lf7/w;->c(Ln7/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Date;

    if-eqz p1, :cond_0

    new-instance v0, Ljava/sql/Timestamp;

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/sql/Timestamp;-><init>(J)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public g(Ln7/c;Ljava/sql/Timestamp;)V
    .locals 1

    iget-object v0, p0, Ll7/c;->a:Lf7/w;

    invoke-virtual {v0, p1, p2}, Lf7/w;->e(Ln7/c;Ljava/lang/Object;)V

    return-void
.end method
