.class public Ly0/a0$a;
.super Ly0/a0$c;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly0/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final n:Ly0/a0$c;


# direct methods
.method public constructor <init>(Ly0/a0$c;)V
    .locals 0

    invoke-direct {p0}, Ly0/a0$c;-><init>()V

    iput-object p1, p0, Ly0/a0$a;->n:Ly0/a0$c;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Ly0/a0$a;->n:Ly0/a0$c;

    invoke-virtual {v0}, Ly0/a0$c;->a()V

    return-void
.end method

.method public b(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Ly0/a0$a;->n:Ly0/a0$c;

    invoke-virtual {v0, p1}, Ly0/a0$c;->b(Ljava/lang/Exception;)V

    return-void
.end method
