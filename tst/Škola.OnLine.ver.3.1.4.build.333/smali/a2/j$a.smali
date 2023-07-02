.class La2/j$a;
.super Ljava/lang/Thread;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La2/j;-><init>([La2/g;[La2/h;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:La2/j;


# direct methods
.method constructor <init>(La2/j;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, La2/j$a;->n:La2/j;

    invoke-direct {p0, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, La2/j$a;->n:La2/j;

    invoke-static {v0}, La2/j;->f(La2/j;)V

    return-void
.end method
