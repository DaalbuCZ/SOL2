.class final Lq9/n$a;
.super Lk9/l;
.source ""

# interfaces
.implements Lj9/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq9/n;->F(Ljava/lang/CharSequence;[Ljava/lang/String;IZI)Lp9/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lk9/l;",
        "Lj9/p<",
        "Ljava/lang/CharSequence;",
        "Ljava/lang/Integer;",
        "Ly8/l<",
        "+",
        "Ljava/lang/Integer;",
        "+",
        "Ljava/lang/Integer;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic p:Z


# direct methods
.method constructor <init>(Ljava/util/List;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    iput-object p1, p0, Lq9/n$a;->o:Ljava/util/List;

    iput-boolean p2, p0, Lq9/n$a;->p:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lk9/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/CharSequence;I)Ly8/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "I)",
            "Ly8/l<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const-string v0, "$this$$receiver"

    invoke-static {p1, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lq9/n$a;->o:Ljava/util/List;

    iget-boolean v1, p0, Lq9/n$a;->p:Z

    const/4 v2, 0x0

    invoke-static {p1, v0, p2, v1, v2}, Lq9/n;->l(Ljava/lang/CharSequence;Ljava/util/Collection;IZZ)Ly8/l;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ly8/l;->c()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1}, Ly8/l;->d()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2, p1}, Ly8/p;->a(Ljava/lang/Object;Ljava/lang/Object;)Ly8/l;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public bridge synthetic k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/CharSequence;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lq9/n$a;->a(Ljava/lang/CharSequence;I)Ly8/l;

    move-result-object p1

    return-object p1
.end method
