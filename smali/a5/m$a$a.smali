.class La5/m$a$a;
.super La5/m$b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La5/m$a;->b(La5/m;Ljava/lang/CharSequence;)La5/m$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic u:La5/m$a;


# direct methods
.method constructor <init>(La5/m$a;La5/m;Ljava/lang/CharSequence;)V
    .locals 0

    iput-object p1, p0, La5/m$a$a;->u:La5/m$a;

    invoke-direct {p0, p2, p3}, La5/m$b;-><init>(La5/m;Ljava/lang/CharSequence;)V

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

    iget-object v0, p0, La5/m$a$a;->u:La5/m$a;

    iget-object v0, v0, La5/m$a;->a:La5/c;

    iget-object v1, p0, La5/m$b;->p:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1, p1}, La5/c;->c(Ljava/lang/CharSequence;I)I

    move-result p1

    return p1
.end method
