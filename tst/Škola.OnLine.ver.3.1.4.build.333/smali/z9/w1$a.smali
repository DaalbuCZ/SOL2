.class final Lz9/w1$a;
.super Lz9/v1;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz9/w1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final r:Lz9/w1;

.field private final s:Lz9/w1$b;

.field private final t:Lz9/r;

.field private final u:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lz9/w1;Lz9/w1$b;Lz9/r;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Lz9/v1;-><init>()V

    iput-object p1, p0, Lz9/w1$a;->r:Lz9/w1;

    iput-object p2, p0, Lz9/w1$a;->s:Lz9/w1$b;

    iput-object p3, p0, Lz9/w1$a;->t:Lz9/r;

    iput-object p4, p0, Lz9/w1$a;->u:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public C(Ljava/lang/Throwable;)V
    .locals 3

    iget-object p1, p0, Lz9/w1$a;->r:Lz9/w1;

    iget-object v0, p0, Lz9/w1$a;->s:Lz9/w1$b;

    iget-object v1, p0, Lz9/w1$a;->t:Lz9/r;

    iget-object v2, p0, Lz9/w1$a;->u:Ljava/lang/Object;

    invoke-static {p1, v0, v1, v2}, Lz9/w1;->t(Lz9/w1;Lz9/w1$b;Lz9/r;Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lz9/w1$a;->C(Ljava/lang/Throwable;)V

    sget-object p1, Lg9/s;->a:Lg9/s;

    return-object p1
.end method
