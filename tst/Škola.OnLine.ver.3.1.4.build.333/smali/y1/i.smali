.class public final synthetic Ly1/i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu3/q$a;


# instance fields
.field public final synthetic a:Ly1/c$a;

.field public final synthetic b:I

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Ly1/c$a;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly1/i;->a:Ly1/c$a;

    iput p2, p0, Ly1/i;->b:I

    iput p3, p0, Ly1/i;->c:I

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Ly1/i;->a:Ly1/c$a;

    iget v1, p0, Ly1/i;->b:I

    iget v2, p0, Ly1/i;->c:I

    check-cast p1, Ly1/c;

    invoke-static {v0, v1, v2, p1}, Ly1/o1;->L0(Ly1/c$a;IILy1/c;)V

    return-void
.end method
