.class public final synthetic Ly1/m;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu3/q$a;


# instance fields
.field public final synthetic a:Ly1/c$a;

.field public final synthetic b:I

.field public final synthetic c:Lx1/c3$e;

.field public final synthetic d:Lx1/c3$e;


# direct methods
.method public synthetic constructor <init>(Ly1/c$a;ILx1/c3$e;Lx1/c3$e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly1/m;->a:Ly1/c$a;

    iput p2, p0, Ly1/m;->b:I

    iput-object p3, p0, Ly1/m;->c:Lx1/c3$e;

    iput-object p4, p0, Ly1/m;->d:Lx1/c3$e;

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, Ly1/m;->a:Ly1/c$a;

    iget v1, p0, Ly1/m;->b:I

    iget-object v2, p0, Ly1/m;->c:Lx1/c3$e;

    iget-object v3, p0, Ly1/m;->d:Lx1/c3$e;

    check-cast p1, Ly1/c;

    invoke-static {v0, v1, v2, v3, p1}, Ly1/o1;->U0(Ly1/c$a;ILx1/c3$e;Lx1/c3$e;Ly1/c;)V

    return-void
.end method
