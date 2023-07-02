.class Lf5/n$a$a;
.super Lf5/n$b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf5/n$a;->b(Lf5/n;Ljava/lang/CharSequence;)Lf5/n$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic u:Lf5/n$a;


# direct methods
.method constructor <init>(Lf5/n$a;Lf5/n;Ljava/lang/CharSequence;)V
    .locals 0

    iput-object p1, p0, Lf5/n$a$a;->u:Lf5/n$a;

    invoke-direct {p0, p2, p3}, Lf5/n$b;-><init>(Lf5/n;Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method g(I)I
    .locals 0

    add-int/lit8 p1, p1, 0x1

    return p1
.end method

.method h(I)I
    .locals 2

    iget-object v0, p0, Lf5/n$a$a;->u:Lf5/n$a;

    iget-object v0, v0, Lf5/n$a;->a:Lf5/c;

    iget-object v1, p0, Lf5/n$b;->p:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1, p1}, Lf5/c;->c(Ljava/lang/CharSequence;I)I

    move-result p1

    return p1
.end method
