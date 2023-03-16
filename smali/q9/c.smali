.class final Lq9/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp9/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lp9/b<",
        "Ln9/c;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/CharSequence;

.field private final b:I

.field private final c:I

.field private final d:Lj9/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj9/p<",
            "Ljava/lang/CharSequence;",
            "Ljava/lang/Integer;",
            "Ly8/l<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;IILj9/p;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "II",
            "Lj9/p<",
            "-",
            "Ljava/lang/CharSequence;",
            "-",
            "Ljava/lang/Integer;",
            "Ly8/l<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;)V"
        }
    .end annotation

    const-string v0, "input"

    invoke-static {p1, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getNextMatch"

    invoke-static {p4, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq9/c;->a:Ljava/lang/CharSequence;

    iput p2, p0, Lq9/c;->b:I

    iput p3, p0, Lq9/c;->c:I

    iput-object p4, p0, Lq9/c;->d:Lj9/p;

    return-void
.end method

.method public static final synthetic a(Lq9/c;)Lj9/p;
    .locals 0

    iget-object p0, p0, Lq9/c;->d:Lj9/p;

    return-object p0
.end method

.method public static final synthetic b(Lq9/c;)Ljava/lang/CharSequence;
    .locals 0

    iget-object p0, p0, Lq9/c;->a:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public static final synthetic c(Lq9/c;)I
    .locals 0

    iget p0, p0, Lq9/c;->c:I

    return p0
.end method

.method public static final synthetic d(Lq9/c;)I
    .locals 0

    iget p0, p0, Lq9/c;->b:I

    return p0
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ln9/c;",
            ">;"
        }
    .end annotation

    new-instance v0, Lq9/c$a;

    invoke-direct {v0, p0}, Lq9/c$a;-><init>(Lq9/c;)V

    return-object v0
.end method
