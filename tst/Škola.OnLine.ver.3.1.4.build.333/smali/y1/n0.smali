.class public final synthetic Ly1/n0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu3/q$a;


# instance fields
.field public final synthetic a:Ly1/c$a;

.field public final synthetic b:Lx1/v1;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Ly1/c$a;Lx1/v1;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly1/n0;->a:Ly1/c$a;

    iput-object p2, p0, Ly1/n0;->b:Lx1/v1;

    iput p3, p0, Ly1/n0;->c:I

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Ly1/n0;->a:Ly1/c$a;

    iget-object v1, p0, Ly1/n0;->b:Lx1/v1;

    iget v2, p0, Ly1/n0;->c:I

    check-cast p1, Ly1/c;

    invoke-static {v0, v1, v2, p1}, Ly1/o1;->G0(Ly1/c$a;Lx1/v1;ILy1/c;)V

    return-void
.end method
