.class Lg8/a$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt8/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg8/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation


# instance fields
.field private final a:Lg8/c;


# direct methods
.method private constructor <init>(Lg8/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg8/a$d;->a:Lg8/c;

    return-void
.end method

.method synthetic constructor <init>(Lg8/c;Lg8/a$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lg8/a$d;-><init>(Lg8/c;)V

    return-void
.end method


# virtual methods
.method public a(Lt8/c$d;)Lt8/c$c;
    .locals 1

    iget-object v0, p0, Lg8/a$d;->a:Lg8/c;

    invoke-virtual {v0, p1}, Lg8/c;->a(Lt8/c$d;)Lt8/c$c;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/String;Lt8/c$a;Lt8/c$c;)V
    .locals 1

    iget-object v0, p0, Lg8/a$d;->a:Lg8/c;

    invoke-virtual {v0, p1, p2, p3}, Lg8/c;->b(Ljava/lang/String;Lt8/c$a;Lt8/c$c;)V

    return-void
.end method

.method public synthetic c()Lt8/c$c;
    .locals 1

    invoke-static {p0}, Lt8/b;->a(Lt8/c;)Lt8/c$c;

    move-result-object v0

    return-object v0
.end method

.method public d(Ljava/lang/String;Ljava/nio/ByteBuffer;Lt8/c$b;)V
    .locals 1

    iget-object v0, p0, Lg8/a$d;->a:Lg8/c;

    invoke-virtual {v0, p1, p2, p3}, Lg8/c;->d(Ljava/lang/String;Ljava/nio/ByteBuffer;Lt8/c$b;)V

    return-void
.end method

.method public e(Ljava/lang/String;Lt8/c$a;)V
    .locals 1

    iget-object v0, p0, Lg8/a$d;->a:Lg8/c;

    invoke-virtual {v0, p1, p2}, Lg8/c;->e(Ljava/lang/String;Lt8/c$a;)V

    return-void
.end method

.method public f(Ljava/lang/String;Ljava/nio/ByteBuffer;)V
    .locals 2

    iget-object v0, p0, Lg8/a$d;->a:Lg8/c;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p2, v1}, Lg8/c;->d(Ljava/lang/String;Ljava/nio/ByteBuffer;Lt8/c$b;)V

    return-void
.end method
