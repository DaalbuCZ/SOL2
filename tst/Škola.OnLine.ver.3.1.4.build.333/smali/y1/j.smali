.class public final synthetic Ly1/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu3/q$a;


# instance fields
.field public final synthetic a:Ly1/c$a;

.field public final synthetic b:I

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Ly1/c$a;IJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly1/j;->a:Ly1/c$a;

    iput p2, p0, Ly1/j;->b:I

    iput-wide p3, p0, Ly1/j;->c:J

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, Ly1/j;->a:Ly1/c$a;

    iget v1, p0, Ly1/j;->b:I

    iget-wide v2, p0, Ly1/j;->c:J

    check-cast p1, Ly1/c;

    invoke-static {v0, v1, v2, v3, p1}, Ly1/o1;->Z0(Ly1/c$a;IJLy1/c;)V

    return-void
.end method
