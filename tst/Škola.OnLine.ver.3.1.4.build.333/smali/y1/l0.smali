.class public final synthetic Ly1/l0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu3/q$a;


# instance fields
.field public final synthetic a:Ly1/c$a;

.field public final synthetic b:Lx1/n1;

.field public final synthetic c:La2/i;


# direct methods
.method public synthetic constructor <init>(Ly1/c$a;Lx1/n1;La2/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly1/l0;->a:Ly1/c$a;

    iput-object p2, p0, Ly1/l0;->b:Lx1/n1;

    iput-object p3, p0, Ly1/l0;->c:La2/i;

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Ly1/l0;->a:Ly1/c$a;

    iget-object v1, p0, Ly1/l0;->b:Lx1/n1;

    iget-object v2, p0, Ly1/l0;->c:La2/i;

    check-cast p1, Ly1/c;

    invoke-static {v0, v1, v2, p1}, Ly1/o1;->t0(Ly1/c$a;Lx1/n1;La2/i;Ly1/c;)V

    return-void
.end method
