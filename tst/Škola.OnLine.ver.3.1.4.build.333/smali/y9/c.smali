.class final Ly9/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx9/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lx9/b<",
        "Lv9/c;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/CharSequence;

.field private final b:I

.field private final c:I

.field private final d:Lr9/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr9/p<",
            "Ljava/lang/CharSequence;",
            "Ljava/lang/Integer;",
            "Lg9/l<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;IILr9/p;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "II",
            "Lr9/p<",
            "-",
            "Ljava/lang/CharSequence;",
            "-",
            "Ljava/lang/Integer;",
            "Lg9/l<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;)V"
        }
    .end annotation

    const-string v0, "input"

    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getNextMatch"

    invoke-static {p4, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly9/c;->a:Ljava/lang/CharSequence;

    iput p2, p0, Ly9/c;->b:I

    iput p3, p0, Ly9/c;->c:I

    iput-object p4, p0, Ly9/c;->d:Lr9/p;

    return-void
.end method

.method public static final synthetic a(Ly9/c;)Lr9/p;
    .locals 0

    iget-object p0, p0, Ly9/c;->d:Lr9/p;

    return-object p0
.end method

.method public static final synthetic b(Ly9/c;)Ljava/lang/CharSequence;
    .locals 0

    iget-object p0, p0, Ly9/c;->a:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public static final synthetic c(Ly9/c;)I
    .locals 0

    iget p0, p0, Ly9/c;->c:I

    return p0
.end method

.method public static final synthetic d(Ly9/c;)I
    .locals 0

    iget p0, p0, Ly9/c;->b:I

    return p0
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lv9/c;",
            ">;"
        }
    .end annotation

    new-instance v0, Ly9/c$a;

    invoke-direct {v0, p0}, Ly9/c$a;-><init>(Ly9/c;)V

    return-object v0
.end method
