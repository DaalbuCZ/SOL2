.class public final synthetic Ly1/q;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu3/q$a;


# instance fields
.field public final synthetic a:Ly1/c$a;

.field public final synthetic b:J

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Ly1/c$a;JI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly1/q;->a:Ly1/c$a;

    iput-wide p2, p0, Ly1/q;->b:J

    iput p4, p0, Ly1/q;->c:I

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, Ly1/q;->a:Ly1/c$a;

    iget-wide v1, p0, Ly1/q;->b:J

    iget v3, p0, Ly1/q;->c:I

    check-cast p1, Ly1/c;

    invoke-static {v0, v1, v2, v3, p1}, Ly1/o1;->y0(Ly1/c$a;JILy1/c;)V

    return-void
.end method
